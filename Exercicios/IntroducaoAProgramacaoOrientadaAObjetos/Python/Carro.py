class Carro:
    def __init__(self, marca="Idefinida", modelo="Indefinido", ano=0, velocidade=0.0):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = velocidade

    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_ano(self):
        return self.ano
    
    def set_ano(self, ano):
        self.ano = ano    
    
    def get_velocidade(self):
        return self.velocidade

    def set_velocidade(self, velocidade):
        self.velocidade = velocidade

    def acelerar(self, aceleracao):
        self.velocidade += aceleracao

    def frear(self, desaceleracao):
        self.velocidade -= desaceleracao

if __name__ == "__main__":

    # Criando um objeto Carro usando o construtor padrão
    veiculo = Carro()

    # Definindo os atributos do carro, usando os setters
    veiculo.set_marca("Jeep")
    veiculo.set_modelo("Compass")
    veiculo.set_ano(2023)

    # Imprimindo os atributos do carro usando os getters
    print("Veículo:")
    print("Marca: {}".format(veiculo.get_marca()))
    print("Modelo: {}".format(veiculo.get_modelo()))
    print("Ano: {}".format(veiculo.get_ano()))
    print("Velocidade: {}".format(veiculo.get_velocidade()))

    # Acelerando o carro em 100 km/h
    veiculo.acelerar(100)

    # Imprimindo a nova velocidade do carro
    print("Velocidade após acelerar: {}".format(veiculo.get_velocidade()))

    # Freando o carro em 20 km/h
    veiculo.frear(20)

    # Imprimir a nova velocidade do carro
    print("Velocidade após frear: {}".format(veiculo.get_velocidade()))

    # Criando um segundo objeto Carro usando o construtor sobrecarregado
    veiculo02 = Carro("Fiat", "Fastback", 2023, 120)

    # Imprimindo os atributos do segundo carro
    print("\n Veiculo 2:")
    print("Marca: {}".format(veiculo02.get_marca()))
    print("Modelo: {}".format(veiculo02.get_modelo()))
    print("Ano: {}".format(veiculo02.get_ano()))
    print("Velocidade: {}".format(veiculo02.get_velocidade()))
