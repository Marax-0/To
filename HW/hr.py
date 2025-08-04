import math
hour = 7
salary = 123.45 * hour
salary_2 = math.ceil(salary)
loss = salary_2 - salary
print("Hour: "+ str(hour))
print("Salary: "+ str(salary_2))
print("Loss: "+ str(loss))