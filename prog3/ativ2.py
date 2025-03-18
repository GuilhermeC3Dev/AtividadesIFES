'''
    Nome: Guilherme Cordeiro Costa e Phietro Souza Aguilar
    Data: 18/03/2025
    O programa recebe 3 valores reais a, b e c e calcula as raízes de uma equação do segundo grau ate que os 3 valores informados sejam iguais a 0.
'''

import math

def calcDelta(a:float, b:float, c:float) -> float: 
    return (b**2) -4*a*c

def calcFunc(a:float, b:float, c:float) -> tuple:
    delta = calcDelta(a, b, c)
    raizes = tuple()
    if delta < 0:
        return tuple()
    r1 = (-b + (math.sqrt(delta)))/(2*a)
    r2 = (-b - (math.sqrt(delta)))/(2*a)
    raizes = (r1, r2)
    return raizes

def main():

    a = float(input())
    b = float(input())
    c = float(input())

    while a!=0 or b!=0 or c!=0:

        raizes = calcFunc(a, b, c)
        if len(raizes) == 0:
            print(f"a={a:.2f}", f"b={b:.2f}", f"c={c:.2f}","sem raizes reais")
        else:
            print(f"a={a:.2f}", f"b={b:.2f}", f"c={c:.2f}", f"r1={raizes[0]:.2f}", f"r2={raizes[1]:.2f}")

        a = float(input())
        b = float(input())
        c = float(input())


if __name__ == '__main__':
    main()