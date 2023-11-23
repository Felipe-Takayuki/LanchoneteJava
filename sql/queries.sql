/* Mostrar todos os clientes */
select * from Clientes;

/* Mostrar todos os Lanches */
select * from Lanches;

/* Mostrar todas as bebidas */
select * from Bebidas;


/* Mostrar os pedidos dos clientes com informações*/

SELECT clientes.cpf, clientes.nome,   bebidas.nome as bebida,lanches.nome as lanche,lanches.preco as precoLanche,    bebidas.preco as precoBebida FROM clientes JOIN pedidos ON clientes.cpf = pedidos.clienteID JOIN lanches ON pedidos.lancheID = lanches.id JOIN bebidas ON pedidos.bebidaID = bebidas.id;