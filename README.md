# LanchoneteJava


### Um sistema para uma lanchonete
 -  crie a base de dados e conecte ao seu banco(esta  em sql/database.sql) ✅
   
 - Possibilite que seu sistema cadastre as informações necessárias para o trabalho ✅


## Conceitos do projeto

### Conexão com o banco 
   - feita usando o driverManager e o Connection

       -  import java.sql.Connection;

       - import java.sql.DriverManager;
   
     
    public Connection conecta(){
       Connection conn = null; 
       
       try {
           String url = "jdbc:mysql://localhost:PORT/Lanchonete?user=USER&password=PASSWORD";
           conn = DriverManager.getConnection(url);
       } catch (SQLException erro) {
         JOptionPane.showMessageDialog(null, erro.getMessage());
       }
       return conn; } 

### Cadastro no banco
   - Usar o preparetedStatement para fazer os inserts e chamar a classe de conexão ao fazer algum processo com sql
   
    public void CadastrarLanche(LancheModel lanche) {
         String sql = "insert into Lanches(nome, descricao, preco) values(?,?,?)";
         conn = new DAO().conecta();
      try {
            pstm = conn.prepareStatement(sql);
            // os números se referem a posição do "?" da string sql
            pstm.setString(1, lanche.getNome());
            pstm.setString(2, lanche.getDesc());
            pstm.setDouble(3, lanche.getPreco());
    
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "LancheDao: " + erro);
        }
      
    }


### Observações
 - Na parte de pedidos é necessário que os dados existam.




