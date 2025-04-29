def fact(n):
    result=1
    for i in range(1,n+1):
        result *=i
    return result
num =int(input("enter your number"))
if num<0:
    print("factorial is not defined for negative numbers")
elif num ==0:
    print("factorial of 0 is 1")
else:
    print("factorial of",num,"is",fact(num))


    

