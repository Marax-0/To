import math
hour = 7
salary = 123.5
up_salary = math.ceil(salary)
salary_2 = up_salary * hour
base_salary = 123.5 * hour
loss = salary_2 - base_salary
print("Hour: " + str(hour))
print("Salary: " + str(salary_2))
print("Loss: " + str(loss))
