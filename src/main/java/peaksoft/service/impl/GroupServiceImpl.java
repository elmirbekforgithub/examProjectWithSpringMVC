package peaksoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Group;
import peaksoft.repository.repositoryInterface.GroupRepository;
import peaksoft.service.GroupService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository repo;

    @Autowired
    public GroupServiceImpl(GroupRepository repo) {
        this.repo = repo;
    }

    @Override
    public Group saveGroup(Group group) {
        return repo.saveGroup(group);
    }

    @Override
    public void removeGroupById(Long id) {
        repo.removeGroupById(id);
    }

    @Override
    public Group getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public List<Group> getAllGroup() {
        return repo.getAllGroup();
    }

    @Override
    public void updateGroup(Long id, Group group) {
        repo.updateGroup( id,group);
    }
}
