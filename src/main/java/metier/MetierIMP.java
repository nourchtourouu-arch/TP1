package metier;

import dao.IDao;

public class MetierIMP implements IMetier {

    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 7;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
