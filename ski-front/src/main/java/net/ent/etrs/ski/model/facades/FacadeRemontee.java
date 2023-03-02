package net.ent.etrs.ski.model.facades;

import net.ent.etrs.ski.exceptions.BusinessException;
import net.ent.etrs.ski.model.entities.Piste;
import net.ent.etrs.ski.model.entities.Remontee;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.SortMeta;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FacadeRemontee implements Serializable
{
    
    public Optional<Remontee> find(Long id) throws BusinessException {
        return null;
    }
    
    public Iterable<Remontee> findAll() throws BusinessException {
        return null;
    }
    
    public Optional<Remontee> save(Remontee remontee) throws BusinessException {
        return null;
    }
    
    public void delete(Long id) throws BusinessException {
    }
    
    public boolean exists(Long id) throws BusinessException {
        return true;
    }
    
    public long count() throws BusinessException {
        return 0;
    }
}
