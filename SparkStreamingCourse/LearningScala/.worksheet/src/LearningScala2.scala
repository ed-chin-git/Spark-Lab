object LearningScala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(200); 
  // _________________Flow control__________________________________________
  // __ If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.");$skip(93); 
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  };$skip(68); 
  
  // Matching - like switch in other languages:
  val number = 1;System.out.println("""number  : Int = """ + $show(number ));$skip(146); 
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	};$skip(87); 
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	};$skip(80); 
                                                  
  // While loops
  var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  while (x >= 0) {
  	println(x)
  	x -= 1
  };$skip(59); 
                                                  
  x = 0;$skip(41); 
  do { println(x); x+=1 } while (x <= 5);$skip(154); val res$0 = 
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20};System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
                                                
	 println({val x = 10; x + 20});$skip(265); 
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var count = 0;System.out.println("""count  : Int = """ + $show(count ));$skip(20); 
	 var prev_val1 = 0;System.out.println("""prev_val1  : Int = """ + $show(prev_val1 ));$skip(20); 
	 var prev_val2 = 0;System.out.println("""prev_val2  : Int = """ + $show(prev_val2 ));$skip(16); 
	 var fibno = 0;System.out.println("""fibno  : Int = """ + $show(fibno ));$skip(324); 
	 for (count <- 1 to 10 ) {
	  	count match {
			 	case 1 => prev_val1=0
									prev_val2=0
				case 2 => prev_val1=1
					 				prev_val2=0
				case 3 => prev_val1=1
				  				prev_val2=0
				case _ =>
			}
			fibno=prev_val1+prev_val2
			println(prev_val2, prev_val1, fibno)
			prev_val2=prev_val1
			prev_val1=fibno
	 }}
	 
}
