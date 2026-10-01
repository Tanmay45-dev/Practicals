
#OS Practical
#Bounded Buffer

import threading
import time
import random
from queue import Queue

#Define Buffer Size
BUFFER_SIZE=5
#CREATE A QUEUE OBJECT WITH MAXIMUM SIZE
buffer = Queue(maxsize=BUFFER_SIZE)

class Producer(threading.Thread):
    def run(self):
        while True:
            item = random.randint(1, 100)
            print(f"producer: producing item{item}")
            try:
                buffer.put(item,block=True,timeout=1) #BLOCK IF BUFER IS FULL
                print(f"producer: Item{item}added to buffer.Current size:{buffer.qsize()}")
            except Exception as e:
                print(f"producer: Could not get item-{e}")

                #time.sleep(random./uniform(0.1,0.5))
                time.sleep(3)

class Consumer(threading.Thread):
    def run(self):
        while True:
            try:
                item=buffer.get(block=True,timeout=1)  #BLOCK IF BUFFER IS EMPTY
                print(f"Consumer:Comsuming Item{item}.Current size:{buffer.qsize}")
                buffer.task_done  #INDICATE THAT THE TASK IS DONE
            except Exception as e:
                print(f"Consumer: Could not get item-{e}")
                
                #time.sleep(random.uniform(0.1,0.5))
                time.sleep(3)


if __name__=="__main__":
    #CREATE AND START PRODUCER AND CONSUMER THREADS
    producer_thread=Producer()
    consumer_thread=Consumer()

    producer_thread.start()
    consumer_thread.start

    producer_thread.join()
    consumer_thread.join()
                    
