package domes;

/**
 * ListNode represents a signe-link list node
 * Each node contains an Object reference to data and a reference to the nextNode in the list. 
 */
public class ListNode
{
	Integer data;
    ListNode nextNode;
	
    ListNode( Integer object )
    {
        data = object;
		nextNode = null;
    }
	

    /**
     * Constructor. It initializes data and sets next node to null
     * @param object a reference to node's data
     */

    /**
     * constructor creates ListNode with passed data and next node
     * @param object the reference to node's data
     * @param node the next node in the list
     */
    ListNode( Integer object, ListNode node )
    {
        data = object;
        nextNode = node;
    }


	/**
     * Returns this node's data
     * @return the reference to node's data
     */
    Object getObject()

    {
        return data;
    }

    /**
     * Get reference to next node
     * @return the next node
     */
    ListNode next()
    {
        return nextNode;
    }
} 
