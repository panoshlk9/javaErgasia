package domes;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.*;


public class IntQueueImpl implements IntQueue {

    public IntQueueImpl() {
    }

    public IntQueueImpl(ListNode firstNode, ListNode lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    ListNode firstNode = new ListNode(null);
		ListNode lastNode = new ListNode(null);

        public boolean isEmpty()
        {
            return firstNode.data==null;// return true if List is empty
        }

        public void put(Integer item) {
            ListNode node = new ListNode(item);
            if (isEmpty()) // firstNode and lastNode refer to same object
                firstNode = lastNode = node;
            else { // firstNode refers to new node
            	node.nextNode = firstNode;
    			firstNode = node;
            }
        }
            public Integer get() throws NoSuchElementException
        {
            if ( isEmpty() ) // throw exception if List is empty
                throw new NoSuchElementException( "name" );

            Integer removedItem = lastNode.data; // retrieve data being removed

            // update references firstNode and lastNode
            if ( firstNode == lastNode )
                firstNode = lastNode = null;
            else 
            {
    			ListNode current = firstNode;

    			// loop while current node does not refer to lastNode
    			while ( current.nextNode != lastNode )
    			current = current.nextNode;

    			lastNode = current; // current is new lastNode
    			current.nextNode = null;
    		} // end else

            return removedItem;
        }
            public int peek() throws NoSuchElementException
            {
                return lastNode.data;
            }
          public void printQueue(PrintStream stream)
          {
              if ( isEmpty() )
              {
                  System.out.printf( "Empty %s\n", "name" );
                  return;
              } // end if

              System.out.printf( "The %s is: ", "name" );
              ListNode current = firstNode;

              // while not at end of list, output current node's data
              while ( current != null )
              {
                  System.out.printf( "%s ", current.data );
                  current = current.nextNode;
              } // end while

              System.out.println( "\n" );
          }

            public int size(){
            int n=0;
            ListNode current = firstNode;
            while ( current.nextNode != lastNode )
                n++;
            n++;
            return n;
        }
    }

	

	

