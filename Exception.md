
# O que é exeções?

Exceções são todos os errros que ocorrem durante o processamento de um metodo que pode ser esperados ou não esperados. Como o tempo já diz, "Exceptions" são exceções. Falhas que não devem ocorrer rotineitamente no fluxo do sistema.

Fluxo: 

			Trowable , exception, error, interruptedException, RuntimeException, ThreadDeath, ArithmeticEcpetion, NullPointException


# Checked Exception?

São execões que são esperadas dentro do fluxo da aplicação, cujo o fluxo ou metodo de um sistema foi praparado para receber. Um bom exempo é um exceção de negocio, onde se deseja informar um erro caso a exceção esperada ocorra.

# Uncked Exception?
São exceções não esperadas para o fluxo ou metodo de um sistema, um bom exemplo é a famosa NUllPointException que ocorre quando se tenta acessar uma referencia de memoria vazia, ou recuperar uma instancia que não existe, dentre outros motivos.

# Bloco Try Catch?
O bloco try catch sempre é utilizado quando o processo que será executado dentro de um metodo é esperado um erro, então cria-se um bloco protegido onde qualquer erro que ocorra dentro do trecho try é direcionado para o trecho catch e sofrerá o devido tratamento de erro.

# Finally Trow?
Finally é um bloco de código que pode ou não ser utilizado junto ao try catch, esse trecho de código sempre será executado independente  se ocorrer o erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independete de erro.

# Throw e Thorws?
Thorws: É a assinatura do metodo que será retornado caso ocorra erro, para o metodo que fez a chamada dentro de um fluxo encadeado.
Throw: É usado para lançar a exceção desejada, juntamente com a mensagem de erro para o metodo que fez a chamada.
