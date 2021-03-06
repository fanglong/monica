package monica.cluster.router.parse;

import monica.cluster.Parser;
import monica.cluster.router.parse.object.Rule;

/**
 * 
 * @author lucy@polarcoral.com
 *
 *         2017-08-29
 */
public class BlockedParser implements Parser {
	private volatile boolean parseResult = false;

	public void doParse(Rule rule) {
		if (null != rule && null == rule.getDestination() && null != rule.getSource()) {
			parseResult = true;
		}
	}

	public boolean isExpected() {
		return parseResult;
	}

}
