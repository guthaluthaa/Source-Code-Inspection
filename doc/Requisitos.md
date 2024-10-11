# Requisitos

As estações de trem frequentemente fornecem máquinas de vender bilhetes que imprimem um bilhete quando um cliente insere a quantia correta para pagar a passagem. As máquinas mantêm uma soma total da quantidade de dinheiro que coletou durante toda sua operação.

## 1.1. Catálogo dos Atores

| Ator    | Descrição                           |
|---------|-------------------------------------|
| Cliente | Usuário da máquina de vender bilhetes.|

## 1.2. Diagrama dos Casos de Uso
[![Captura de tela 2024-10-02 235552](https://github.com/user-attachments/assets/90ab2a7f-59b7-42e0-9b2a-c8403bb32833)](https://github.com/guthaluthaa/Source-Code-Inspection/blob/guthaluthaa-patch-doc-1/doc/Captura%20de%20tela%202024-10-02%20235552.png)


## 1.3. Especificação dos Casos de Uso

### CSU01 – Inserir Dinheiro
- **Identificador:** CSU01
- **Nome:** Inserir dinheiro
- **Atores:** Cliente
- **Sumário:** Uma quantia de dinheiro é inserida na máquina, sempre representada por uma única nota de papel-moeda.
- **Complexidade:** Médio
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** O valor inserido é adicionado ao saldo total disponível.

#### Fluxo Principal
1. O Cliente insere uma nota de papel-moeda.
2. O Sistema mostra uma mensagem informando para o Cliente aguardar alguns instantes.
3. O Sistema valida a nota de papel-moeda inserida.
4. O Sistema adiciona o valor ao saldo disponível.
5. O Sistema informa que a nota de papel-moeda foi aceita.
6. O Sistema informa o saldo atual. Caso de uso é encerrado.

#### Fluxo de Exceção 1: 
- **3a.** O Sistema não valida a nota de papel-moeda.
  1. O Sistema devolve a nota de papel-moeda.
  2. Enquanto o Cliente não retirar a nota de papel-moeda, o Sistema informa que a nota de papel-moeda é inválida.
  3. O Cliente retira a nota de papel-moeda.
  4. Volta ao passo 6 do Fluxo Principal.

### CSU02 – Solicitar Bilhete
- **Identificador:** CSU02
- **Nome:** Solicitar bilhete
- **Atores:** Cliente
- **Sumário:** Um único bilhete de transporte é impresso.
- **Complexidade:** Fácil
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** Um bilhete é impresso e seu valor é debitado do saldo disponível.

#### Fluxo Principal
1. O Cliente solicita a impressão do bilhete de transporte.
2. O Sistema verifica o saldo e emite o bilhete.
3. O Sistema informa o saldo atual. Caso de uso é encerrado.

#### Fluxo de Exceção 1: 
- **2a.** O saldo é insuficiente para emissão do bilhete.
  1. O Sistema informa que o saldo é insuficiente.
  2. Volta ao passo 3 do Fluxo Principal.

### CSU03 – Solicitar Troco
- **Identificador:** CSU03
- **Nome:** Solicitar troco
- **Atores:** Cliente
- **Sumário:** O troco é devolvido, também em nota de papel-moeda.
- **Complexidade:** Fácil
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** O valor em nota de papel-moeda é devolvido e o saldo disponível é zerado.

#### Fluxo Principal
1. O Cliente solicita devolução do saldo restante como troco.
2. O Sistema verifica o saldo e devolve a quantidade do saldo em notas de papel-moeda.
3. O Sistema zera o valor do saldo.
4. O Sistema informa o saldo atual. Caso de uso é encerrado.
