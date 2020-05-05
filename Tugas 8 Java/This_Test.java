public class This_Test {
 
   //Instance variable num
   int num=10;
 
   This_Test(){
      System.out.println("Berikut adalah contoh program keyword this "); 
   }

   This_Test(int num){
      //Invoking default konstruktor
      this();
      
      //Menyamakan local variable num keinstance variable num
      this.num=num;    
   }
   
   public void greet(){
      System.out.println("Selamat datang di programmergalaulagi.blogspot.com");
   }
      
   public void print(){
      //Local variable num
      int num=20;
      
      //Mencetak instance variable
      System.out.println("nilai dari local variable num adalah : "+num);
      
      //Mencetak local variable
      System.out.println("nilai dari instance variable num adalah : "+this.num);
      
      //Memanggil greet method dari sebuah class
      this.greet();     
   }
   
   public static void main(String[] args){
      //Class
      This_Test obj1=new This_Test();
      
      //Memanggil print method
      obj1.print();
   
      //nilai baru dari num variable melalui parametrized constructor
      This_Test obj2=new This_Test(30);
      
      //Memanggil print method lagi
      obj2.print(); 
   }

}

