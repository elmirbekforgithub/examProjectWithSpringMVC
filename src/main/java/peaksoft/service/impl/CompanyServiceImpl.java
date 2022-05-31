package peaksoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Company;
import peaksoft.repository.repositoryInterface.CompanyRepository;
import peaksoft.service.CompanyService;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository repo;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repo) {
        this.repo = repo;
    }

    @Override
    public Company saveCompany(Company company) {
        repo.saveCompany(company);
        return company;
    }

    @Override
    public void removeCompanyById(Long id) {
        repo.removeCompanyById(id);
    }

    @Override
    public Company getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public List<Company> getAllCompany() {
        return repo.getAllCompany();
    }

    @Override
    public void update(Long id, Company company) {
        repo.update(id, company);
    }
}
