#Guilherme Cordeiro Costa e Fillipy Costa
#data: 16/12/2024
#desenvolvido no ifes serra
#esse codigo armazena em uma lista de listas o valor das ordenadas e das abcissas (valores de y e x) para a funçao exp(x). Alem disso o programa imprime uma lista de listas e solicita 
# ao usuario os valores do intervalo fechado e o valor do incremento.

def f_criarlista(v1:float, v2:float, inc:float)->list:
    import math
    listaInterna=list()
    listaExterna=list()
    x=v1
    while x<=v2:
        y=math.exp(x)
        listaInterna=[x,y]
        listaExterna.append(listaInterna)
        x=x+inc
    return listaExterna 
    
def f_imprimirlista(listaExterna:list)->None:
    for par in listaExterna:
        print(f"x={par[0]:.2f} y={par[1]:.2f}")
def main():
    v1=float(input())
    v2=float(input())
    v3=float(input())
    f_imprimirlista(f_criarlista(v1,v2,v3))
if __name__ == "__main__":
    main()