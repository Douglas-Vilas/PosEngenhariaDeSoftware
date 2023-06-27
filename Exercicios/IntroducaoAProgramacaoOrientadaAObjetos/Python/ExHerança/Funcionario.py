from abc import abstractmethod
from pagamento import Pagamento

# Classe Abstrata Funcionário implementando a interface Pagamento
class Funcionario(Pagamento):
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def get_nome(self):
        return self.nome

    def get_salario(self):
        return self.salario

    # Método abstrato para calcular o salário anual (deve ser implementado pelas subclasses)
    @abstractmethod
    def calcula_salario_anual(self):
        pass

    def calcula_pagamento_mensal(self):
        # Retorna o salário mensal padrão
        return self.salario  
