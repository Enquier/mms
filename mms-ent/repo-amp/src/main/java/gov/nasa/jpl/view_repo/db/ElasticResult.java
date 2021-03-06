package gov.nasa.jpl.view_repo.db;

import org.json.JSONObject;

public class ElasticResult {

    public JSONObject current = null;
    public String elasticId = null;
    public String sysmlid = null;

    @Override
    public String toString() {
        return String.format(
                "\n\tsysmlid: %s\n\telasticId: %s\n\tcurrent: %s\n",
                sysmlid, elasticId, current);
    }
}
