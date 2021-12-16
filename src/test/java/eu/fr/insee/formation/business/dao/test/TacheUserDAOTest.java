package eu.fr.insee.formation.business.dao.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import eu.fr.indyli.formation.business.config.EcolisBusinessConfig;
import eu.fr.indyli.formation.business.taches.dao.IUserTacheDAO;
import eu.fr.indyli.formation.business.taches.entity.UserTache;
import eu.fr.indyli.formation.business.utils.EcolisConstantes;


@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes={EcolisBusinessConfig.class})
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TacheUserDAOTest {

	@Resource(name = EcolisConstantes.EcolisConstantesDAO.USER_TACHE_DAO_KEY)
	IUserTacheDAO userRepository;

	@Test
	public void testFindAll(){
		List<UserTache>  listUser = this.userRepository.findAll();
		for (UserTache utilisateur : listUser) {
			System.out.println(utilisateur);
		}
		Assert.assertTrue(listUser.size()>0);
	}
}
