package parseXml;

public class Table {
        private String TableName;
        private String EXTN_DN;
        private String EXTN_TYPE;
        private String PLATFORM_ID;
        private String status;

        public String getStatus() {
            return status;
        }


        public void setStatus(String status) {
            this.status = status;
        }

        public String getTableName() {
            return TableName;
        }

        public void setTableName(String tableName) {
            TableName = tableName;
        }

        public String  getEXTN_DN() {
            return EXTN_DN;
        }

        public void setEXTN_DN(String EXTN_DN) {
            this.EXTN_DN = EXTN_DN;
        }

        public String getEXTN_TYPE() {
            return EXTN_TYPE;
        }

        public void setEXTN_TYPE(String EXTN_TYPE) {
            this.EXTN_TYPE = EXTN_TYPE;
        }

        public String getPLATFORM_ID() {
            return PLATFORM_ID;
        }

        public void setPLATFORM_ID(String PLATFORM_ID) {
            this.PLATFORM_ID = PLATFORM_ID;
        }


}
