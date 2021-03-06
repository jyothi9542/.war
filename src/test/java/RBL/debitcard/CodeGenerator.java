package RBL.debitcard;

import org.junit.Test;

import top.lshaci.framework.mybatis.utils.MybatisGeneratorUtils;
import top.lshaci.framework.service.utils.ServiceGeneratorUtils;

/**
 * Project code genertor
 * 
 * @author lshaci
 * @since 0.0.3
 */
public class CodeGenerator {
	/**
	 * the project domain package
	 */
	private String domainPackage = "RBL.debitcard.model.domain";
	
	/**
	 * the project service package
	 */
	private String servicePackage = "RBL.debitcard.service";
	
	/**
	 * the project mapper package
	 */
	private String mapperPackage = "RBL.debitcard.mapper";

	/**
	 * Generator domain, mapper interface, mapper xml file with framework mybatis generator util 
	 * 
	 * @throws Exception
	 */
	@Test
	public void generatorWithFrameworkMybatis() throws Exception {
		MybatisGeneratorUtils.generator(CodeGenerator.class);
	}
	
	/**
	 * Generator domain, mapper interface, mapper xml file, service interface, service implement <br>
	 * with framework service generator util 
	 * 
	 * @throws Exception
	 */
	@Test
	public void generatorWithFrameworkService() throws Exception {
		ServiceGeneratorUtils.generator(CodeGenerator.class, servicePackage, domainPackage, mapperPackage);
	}
	
}
