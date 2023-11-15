class Forma:
    def calcular_area(self):
        pass


class Retangulo(Forma):
    def __init__(self, largura, altura):
        self.largura = largura
        self.altura = altura

    def calcular_area(self):
        return self.largura * self.altura


class Quadrado(Retangulo):
    def __init__(self, lado):
        super().__init__(lado, lado)

    def set_lado(self, lado):
        self.largura = lado
        self.altura = lado


"""
Aqui eu utilizei o exemplo básico para mostrar do principio do
Liskov Substitution Principle. Nele, eu tenho uma classe base Forma,
que possui um método calcular_area, que é utilizado pelas classes Retangulo e Quadrado.
A classe Quadrado herda de Retangulo, mas sobrescreve o método set_lado,
para que os dois lados sejam iguais. Isso é uma violação do principio de Liskov,
 pois o método set_lado da classe base não pode ser substituido por um
"""
