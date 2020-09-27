package iteratordesignpattern;

import java.util.*;

/** 
 * 
 * @author Chris Walls
 * 
 */

public class ContractorToDoList {
	
	private static final int SIZE = 4;
	private String address;
	private ToDo[] todos = new ToDo[SIZE];
	private int count = 0;
	private double total = 0;
	
	/**
	 * Constructor
	 * @param address
	 */
	public ContractorToDoList(String address) {
		this.address = address;
	}
	/**
	 * 
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 * 
	 * All params are neccessary to create a new ToDo[] list, growing array if size is too small and totals up the prices.
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		if(count >= this.todos.length) {
			this.todos = growArray(todos);
		}
		todos[count] = new ToDo(title, description, price, contact, supplies);
		++count;
		this.total += price;
	}
	/**
	 * 
	 * @return creates new Iterator
	 */
	public ToDoIterator createIterator() {
		ToDoIterator newTodo = new ToDoIterator(this.todos);
		return newTodo;
	}
	/**
	 * 
	 * @return address of the Contract
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * 
	 * @return total cost by talling in addToDo method
	 */
	public double getTotalCost() {
		return this.total;
	}
	/**
	 * 
	 * @param todos
	 * @return new ToDO list twice the size.
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] newTodos = new ToDo[todos.length*2];
		return newTodos;
	}
}
