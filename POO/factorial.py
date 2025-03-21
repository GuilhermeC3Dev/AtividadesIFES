def calcFatorial(num:int)->int:

    factorial = 1
    for i in range(2, num+1):
        factorial*=i
    return factorial


def main():
    num = int(input())
    fatorial = calcFatorial(num)
    print(fatorial)

if __name__ == "__main__":
    main()