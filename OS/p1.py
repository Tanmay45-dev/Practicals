import threading
import time

def run(delay,taskname):
    print(f"{taskname}Starting....\n")
    time.sleep(delay)
    print(f"{taskname}Completed...\n")

thread1=threading.Thread(target=run,args=(5,"task1"))
thread2=threading.Thread(target=run,args=(5,"task2"))

thread1.start()
thread2.start()
print("All Threads Started")

thread1.join()
thread2.join()
print("All Threads task Completed")
