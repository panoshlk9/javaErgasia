package domes;

public class NoSuchElementException extends RuntimeException
{
	/**
	 * Default constructor, calls constructor with parameter name set to "List"
	 */
	public NoSuchElementException()
	{
		this( "List" ); // call other EmptyListException constructor
	} // end EmptyListException no-argument constructor

	/**
	 * Constructor with list's name, calls RuntimeException(String)
	 * @param name the list name
	 */
	public NoSuchElementException( String name )
	{
		super( name + " is empty" ); // call superclass constructor
	} 
} 