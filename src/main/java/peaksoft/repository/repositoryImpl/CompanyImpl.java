package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.repository.repositoryInterface.CompanyRepository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CompanyImpl implements CompanyRepository {
    @Override
    public Company saveCompany(Company company) {
        return null;
    }

    @Override
    public void removeCompanyById(Long id) {

    }

    @Override
    public Company getById(Long id) {
        return null;
    }

    @Override
    public List<Company> getAllCompany() {
        return null;
    }

    @Override
    public void update(Long id, Company company) {

    }
}
