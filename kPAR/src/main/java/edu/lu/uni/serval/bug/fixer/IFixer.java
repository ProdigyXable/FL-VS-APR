package edu.lu.uni.serval.bug.fixer;

import edu.lu.uni.serval.dataprepare.DataPreparer;
import edu.lu.uni.serval.utils.SuspiciousPosition;
import java.util.List;

/**
 * Fixer Interface.
 * 
 * @author kui.liu
 *
 */
public interface IFixer {

	public List<SuspiciousPosition> readSuspiciousCodeFromFile(String metric, String buggyProject, DataPreparer dp);
	
	public SuspCodeNode parseSuspiciousCode(SuspiciousPosition suspiciousCode);

	public void fixProcess();
	
}
