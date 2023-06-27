# Classe Gerente que estende Funcionário
from funcionario import Funcionario

class Gerente(Funcionario):
    # Bônus fixo para o gerente
    BONUS = 0.15 

    def __init__(self, nome, salario):
        super().__init__(nome,salario)

    def calcular_salaio_anual(self):
        # Calcula o salário anual com o bônus
        return (self.get_salario() * 12) + (self.get_salario() * Gerente.BONUS * 12) 
    
    def calcula_pagamento_mensal(self):
        # Divide o salário anual por 12 para obter o pagamento mensal
        return self.calcula_salario_anual() / 12 
