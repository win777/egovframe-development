package egovframework.bdev.imp.batch.wizards.jobcreation.pages;

import org.eclipse.swt.widgets.Shell;

import egovframework.bdev.imp.batch.common.BatchMessages;
import egovframework.bdev.imp.batch.wizards.jobcreation.model.BatchPageBeanIDList;
import egovframework.bdev.imp.batch.wizards.jobcreation.model.BatchXMLFileBeanIDList;
import egovframework.bdev.imp.confmngt.preferences.listeners.ListenerPreferencePage;
import egovframework.bdev.imp.confmngt.preferences.listeners.ListenerTabContents;
import egovframework.bdev.imp.confmngt.preferences.listeners.model.JobListenerInfo;

/**
 * <pre>
 * BatchJobCreationCustomizePage에서
 * Job, Step, Chunk Listener TableViewer에 추가, 수정할때 여는 Dialog
 * 
 * type 1: Job Listener 
 * type 2: Step Listener 
 * type 3: Chunk Listener
 * </pre>
 * 
 * @author 배치개발환경 개발팀 조용현
 * @since 2012.06.28
 * @version 1.0
 * @see <pre>
 *  &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *    
 * 수정일	  	수정자	  수정내용
 * -----------	------	----------------
 * 2012.07.24	조용현	최초생성
 * 
 * 
 * </pre>
 */
public class JobListenerDialog extends ListenerDialog {
	
	/**
	 * JobListenerDialog 생성자
	 * 
	 * @param parent
	 * @param items
	 * @param batchJobListBeanIDList
	 * @param pageBeanIDs
	 *
	 */
	public JobListenerDialog(Shell parent, String[] items,
			BatchXMLFileBeanIDList batchJobListBeanIDList,
			BatchPageBeanIDList pageBeanIDs) {
		super(parent, items, batchJobListBeanIDList, pageBeanIDs);
		
		setTitle(BatchMessages.JobListenerDialog_TITLE);
		
		setDescriptionOneString(BatchMessages.JobListenerDialog_DESCRIPTION_MAIN);
		setDescriptionTwoString(BatchMessages.JobListenerDialog_DESCRIPTION_CONTENTS);
		
		ListenerTabContents contents = new ListenerTabContents("Job", new JobListenerInfo(), ListenerPreferencePage.JOB_LISTENER_PREFERENCE_STORE_NAME, true);  //$NON-NLS-1$ //$NON-NLS-2$
		setContents(contents);
	}
}
