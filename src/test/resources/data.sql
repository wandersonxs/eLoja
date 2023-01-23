insert into usuario (email, nome, senha) values ('wandersonxs@yahoo.com.br', 'Wanderson X', 'Teste123');

insert into produto (descricao, nome, preco, quantidade) values ('Computador', 'Macbook', 10000.00, 10);
insert into produto (descricao, nome, preco, quantidade) values ('Computador', 'Dell', 5000.00, 20);
insert into produto (descricao, nome, preco, quantidade) values ('Computador', 'Mouse', 100.00, 10);
insert into produto (descricao, nome, preco, quantidade) values ('Computador', 'Notebook HP', 3000.00, 10);

insert into endereco (cidade, endereco, usuario_id) values ('São Francisco do Sul', 'Rua Oslo', 1);

insert into pedido (usuario_id) values (1);

insert into pedido_produto (pedido_id, produto_id) values (1, 1);
insert into pedido_produto (pedido_id, produto_id) values (1, 2);
insert into pedido_produto (pedido_id, produto_id) values (1, 3);
insert into pedido_produto (pedido_id, produto_id) values (1, 4);