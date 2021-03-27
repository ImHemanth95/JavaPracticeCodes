package practice_program;
import java.util.*;  

class AddBooks {  
int id;  
String name,author,publisher;  
int quantity;  
public AddBooks(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}    
//public class AddBooks {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<AddBooks> list=new ArrayList<AddBooks>();  
    //Creating Books  
    AddBooks b1=new AddBooks(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    AddBooks b2=new AddBooks(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
    AddBooks b3=new AddBooks(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(AddBooks b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  

		
	
		
		
	}

