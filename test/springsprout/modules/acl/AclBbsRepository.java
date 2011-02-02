package springsprout.modules.acl;

import org.springframework.security.access.annotation.Secured;
import springsprout.common.dao.GenericDao;
import springsprout.domain.security.AclBbs;

import java.io.Serializable;

public interface AclBbsRepository extends GenericDao<AclBbs>{

	public AclBbs getById(Serializable id);
	
	@Secured("ACL_OBJECT_DELETE")
	public void delete(AclBbs bbs);
	
	@Secured({"IS_AUTHENTICATED_ANONYMOUSLY", "ROLE_USER", "ACL_OBJECT_READ"})
	public AclBbs get(AclBbs bbs);
	
	
}
