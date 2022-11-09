# SET did_computer_boot = INPUT "Did the computer boot up?"
# 
# IF did_computer_boot is "no" B
#    THEN SET plugged_in = INPUT

#     IF plugged_in is no
#           print("plug it in")
#           THEN SET did_it_fix = INPUT ("Did this fix the problem?")
#           IF did_it_fix is "no"
#           print(The computer is broken)
#           ELSE print(Login with password)
#   ELSE print ("The computer is broken")
# ELSE print("login with password")

did_computer_boot = input("Did the computer boot up? ")

if did_computer_boot == "no":
    plugged_in = input("Is it plugged in? ")
    if plugged_in == "no":
        print("Plug it in")
        did_it_fix = input("Did this fix the problem? ")
        if did_it_fix == "no":
            print("The computer is broken")
        else:
            print("Login with password")    
    else:
        print("The computer is broken")   

else: print("Login with password")    

