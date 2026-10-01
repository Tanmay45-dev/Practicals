#FCFS
def find_waiting_time(processes,n,burst_time,waiting_time):
    """Calculates The Waiting Time For Each process.
    """

    waiting_time[0]=0 # First Process has 0 Waiting time
    for i in range(1,n):
        waiting_time[i]=burst_time[i-1]+waiting_time[i-1]

def find_turn_around_time(processes,n,burst_time,waiting_time,turn_around_time):
    """
   calculates The turnaround time for each process
   """

    for i in range(n):
        turn_around_time[i]=burst_time[i]=waiting_time[i]


def find_average_time(processes,n,burst_time):
    """
    Calculate and prints the average waiting and tournaround times.
    """

    waiting_time=[0]*n
    turn_around_time=[0]*n
    total_waiting_time=0
    total_turn_around_time=0

    find_waiting_time(processes,n,burst_time,waiting_time)
    find_turn_around_time(processes,n,burst_time,waiting_time,turn_around_time)

    print("Processes\tBurst Time\tWaiting Time\tTurn Around Time")

    for i in range(n):
        total_waiting_time+=waiting_time[i]
        total_turn_around_time+=turn_around_time[i]
        print(f"{processes[i]}\t\t{burst_time[i]}\t\t{turn_around_time[i]}")

    print(f"\nAverage Waiting Time ={total_waiting_time/n:.2f}")
    print(f"Average Turn Around Time={total_turn_around_time/n:.2f}")


if __name__=="__main__":
    #Example Usage:
    processes=[1,2,3] #Process IDs
    n=len(processes)
    burst_time=[10,5,8] # Burst Time For Each Process

    find_average_time(processes,n,burst_time)
