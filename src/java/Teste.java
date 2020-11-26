
import br.com.pcv.dao.HibernateUtil;
import br.com.pcv.vo.Pizza;

public class Teste {
    public static void main(String [] args){
        Pizza p = new Pizza();
        p.setPreco(30.00);
        p.setSabor1("Calabresa");
        p.setSabor2("Calabresa");
        p.setTamanho("G");
        
        HibernateUtil.getSessionFactory().openSession().save(p);
    }
}
