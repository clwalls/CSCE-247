package iteratordesignpattern;

/**
 * 
 * @author chris
 *
 */
public class ToDoIterator implements Iterator {
	
	private ToDo[] todos;
	private int position = 0;
	
	/**
	 * 
	 * @param todos initializing todo in constructor
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	/**
	 * @returns boolean based on if there is more information in the todo[]
	 */
	@Override
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else { 
			return true;
		}
	}
	@Override
	/**
	 * returns Todo, iterating throughout the todo[] based on position.
	 */
	public ToDo next() {
		ToDo todo = todos[position];
		++position;
		return todo;
	}

}
