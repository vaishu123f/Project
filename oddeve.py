def separate_odd_even(numbers):
    odd_numbers=[]
    even_numbers=[]
    for num in numbers:
        if num%2==0:
            even_numbers.append(num)
        else:
            odd_numbers.append(num)
    return odd_numbers,even_numbers 
        
numbers=[int(x)for x in input("enter  your number:").split()]
odd_numbers,even_numbers =separate_odd_even(numbers)
print("odd numbers:",odd_numbers)
print("even numbers:",even_numbers)
