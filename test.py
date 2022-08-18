month = input("Enter the month ('January', ...,'December'):\n")
day = input("Enter the start day ('Monday', ...,'Sunday'):\n")

even_months = ['April', 'June', 'September', 'November']
days = ['Monday','Tuesday','Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']

magic_number = days.index(day)
magic_numbers = [8, 15, 22, 29, 36]

if month in even_months:    x = 31
elif month != "February":   x = 32
else:                       x = 29

print(month)
print("Mo Tu We Th Fr Sa Su")

for i in range (1, x):
    if (i == 1):
        for k in range (0, magic_number):
            print ("   ", end="") 
        print(str(i).rjust(2), end=" ")
    else:
        if ((i + magic_number) in magic_numbers):
            print()
        print(str(i).rjust(2), end=" ")