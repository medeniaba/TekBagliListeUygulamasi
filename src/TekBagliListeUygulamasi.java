
class Node {
 
int data ; 
Node next ; 

Node ( int data ) {
	this.data = data ; 
	next = null ; 
}
	
}


public class TekBagliListeUygulamasi {
		
	Node head ; 
	Node tail ; 

	void basaekle (int x ) {
		
		Node eleman = new Node (x);
		eleman.data = x ; 
		if ( head == null ) {
			
			eleman.next = null ; 
			head = eleman; 
			tail = eleman ; 
				}
		
		else {
		      
			eleman.next = head ; 
			head = eleman ; 
		
		}
		
		
	}

	void sonaekle ( int x ) {
		
		Node eleman = new Node (x) ; 
		 eleman.data = x ; 
	    if ( head == null ) {
	    	
	    	eleman.next = null ; 
	    	head = eleman ; 
	    	tail = eleman ; 
		 
	    }
	    
	    else {
	    	eleman.next = null ; 
	    	tail.next = eleman ; 
	    	tail= eleman ;
	    	
	    }}
	    

	void Ortayaekle ( int indis ,  int x ) {
		
		Node eleman = new Node (x);
		eleman.data = x  ;
		
		if ( head == null && indis == 0 ) {
			eleman.next = null ; 
		     head = eleman ; 
		     tail = eleman ; 
		     
			
		} 
		
		else if ( head != null && indis == 0) {
		
			   
					eleman.next = head ; 
					head = eleman ; 
					System.out.println(indis + " indis sıraya eklendi ");
			
			
		}
		
		else {
	           int n = 0 ; 
			  Node temp = head ; 
			  Node temp2 = head ; 
			  
			  while ( temp.next != null) {
				  
				  n++ ; 
				  temp2 = temp ; 
				  temp = temp.next ; 
				  
				  
			  }
			  if ( n == indis ) {
				  
				  temp2.next = eleman ;
				  eleman.next = temp ; 
				  System.out.println("Eleman eklendi ");
				  
				  
			  }
			  
			  else {
				  
				  
				  
				  temp = head ; 
				  temp2 = head ;
				  int i=0 ; 
				  while ( i != indis ) {
					  
					  temp2 = temp ; 
					  temp = temp.next ; 
					  i++ ; 
					  
				  }
				  temp2.next = eleman ; 
				  eleman.next = temp ; 
				  
				  System.out.println(indis + " . sıraya eleman eklendi " );
			  }
		}
		
		
		
		
	}
	   
	void yazdır () {
		
		if ( head == null ) {
			
			System.out.println( " bu liste boş ");
			
		}
		else {
			
			Node temp = head ; 
			
			//System.out.print (" bas -> ");
			
			while ( temp != null ) {
				  System.out.print (temp.data + " -> ");
				  temp = temp.next ; 
				 
			
			}
			
			//System.out.print ( " son ");
			
			
		}
	}

		

		public static void main(String[] args) {
			
			
			TekBagliListeUygulamasi uygula = new TekBagliListeUygulamasi () ; 
			
			
			Node elemanbir = new Node(5); 
			
			Node elemaniki = new Node(80); 
			
			Node elemanuc = new Node(90); 
		   
			
			elemanbir.data = 5 ;
			elemaniki.data = 80 ; 
			elemanuc.data = 90 ; 
			
			
			
			
			
			
			uygula.basaekle(10);
			uygula.basaekle(20);
			uygula.basaekle(30);
			
			System.out.println( " ");
			
			uygula.sonaekle(40);
			uygula.sonaekle(50);
			uygula.sonaekle(60);
			
			uygula.Ortayaekle(3, 25);
			uygula.Ortayaekle(6 , 55);
			
			uygula.yazdır();
			
			
		/*	Node A = new Node ();
			Node B = new Node ();
			Node C = new Node ();
			Node D = new Node ();
			
			
			A.data = 1 ;
			B.data = 2 ;
			C.data = 3 ; 
			D.data = 44 ; 
	     
	 		
			
			A.next = B ; 
			B.next = C ; 
			C.next = D  ; 
			D.next = null ; 
		
			
			Node temp = A ;
			
			while ( temp.next != null ) {
				   
				 System.out.println(temp.data);
				 
				 temp =temp.next ; */
			
			
			
		
			
				
				
			}
			

		}



	

