object Fibo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}

/*=================== fibonacci python function ========================================
     
def fibo_function(n):
  '''
  Without using recursion
  '''
  fib_seq=[0,1] # each element = sum of 2 prev elements (except for 1st 2 elems)
  if n<3:
      pass
  else:
      # create fib sequence with n elements
      for i in range(2,n):
          fib_no=( fib_seq[i-1]+fib_seq[i-2] )
          fib_seq.append(fib_no)
  return fib_seq[n-1]
  
def recur_fibo(n):
  '''
  With recursion
  '''
  if n == 1:
    return 0
  elif n == 2 or n == 3:
    return 1
  else:
    return recur_fibo(n-1) + recur_fibo(n-2)

N_th=5
print('The',N_th,'th number in the Fibonacci sequence =',fibo_function(N_th))
print('The',N_th,'th number in the Fibonacci sequence =',recur_fibo(N_th))
==================================================================================*/