"""CharChecker"""
s = str(input(""))
if s.isupper() == True:
    print("All Capital Letter")
elif s.islower() == True:
    print("All Small Letter")
else:
    print("Mix")
