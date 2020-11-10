object LearningScala2 {
  // _________________Flow control__________________________________________
  // __ If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")
                                                  //> The world makes sense.
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  }                                               //> The world makes sense.
  
  // Matching - like switch in other languages:
  val number = 1                                  //> number  : Int = 1
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> One
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  
  // While loops
  var x = 5                                       //> x  : Int = 5
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
                                                  
  x = 0
  do { println(x); x+=1 } while (x <= 5)          //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20}                           //> res0: Int = 30
                                                
	 println({val x = 10; x + 20})            //> 30
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var count = 0                            //> count  : Int = 0
	 var prev_val1 = 0                        //> prev_val1  : Int = 0
	 var prev_val2 = 0                        //> prev_val2  : Int = 0
	 var fibno = 0                            //> fibno  : Int = 0
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
	 }                                        //> (0,0,0)
                                                  //| (0,1,1)
                                                  //| (0,1,1)
                                                  //| (1,1,2)
                                                  //| (1,2,3)
                                                  //| (2,3,5)
                                                  //| (3,5,8)
                                                  //| (5,8,13)
                                                  //| (8,13,21)
                                                  //| (13,21,34)
	 
}