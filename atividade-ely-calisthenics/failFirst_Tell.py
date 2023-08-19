# Codigo antigo do meu repositorio algoritmos especiais
# def main():
#     #entrada
    
#     raio = int(input('Insira o valor do raio: '))
#     pi = 3.14159

#     #processamento

#     volume = calcular_volume(pi, raio)


#     #saída

#     print(f'VOLUME = {volume}')


# def calcular_volume(pi, raio):
#     calculo = (4/3) * pi * raio ** 3 
#     return calculo 


#Refactor usando Fail First e Tell, don't ask.
def calcular_volume():
    raio = int(input('Insira o valor do raio: '))
    
    calculo = calcular(raio)
    print(f'VOLUME = {calculo}')
    
def calcular(raio):
    if raio <= 0: 
        raise ValueError("Não existe volume de esfera com raio igual 0 ou negativo.")

    pi = 3.14159
    calcular = (4/3) * pi * raio ** 3 
    return calcular

def main():
    calcular_volume()

main()
