package springsprout.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MemberTest {

	@Test
	public void getAvatar() throws Exception {
		Member member = new Member();
		member.setEmail("whiteship2000@gmail.com");
		member.makeAvatar();
		assertEquals("http://www.gravatar.com/avatar/d3a3e1e76decd8760aaf9af6ab334264?r=X", member.getAvatar());
	}
	
}
