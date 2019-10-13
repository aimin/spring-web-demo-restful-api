package clue.model;

import java.util.ArrayList;
import java.util.List;

public class ClTradeOrgExample implements C_IfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ClTradeOrgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNull() {
            addCriterion("linktel is null");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNotNull() {
            addCriterion("linktel is not null");
            return (Criteria) this;
        }

        public Criteria andLinktelEqualTo(String value) {
            addCriterion("linktel =", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotEqualTo(String value) {
            addCriterion("linktel <>", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThan(String value) {
            addCriterion("linktel >", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThanOrEqualTo(String value) {
            addCriterion("linktel >=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThan(String value) {
            addCriterion("linktel <", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThanOrEqualTo(String value) {
            addCriterion("linktel <=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLike(String value) {
            addCriterion("linktel like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotLike(String value) {
            addCriterion("linktel not like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelIn(List<String> values) {
            addCriterion("linktel in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotIn(List<String> values) {
            addCriterion("linktel not in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelBetween(String value1, String value2) {
            addCriterion("linktel between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotBetween(String value1, String value2) {
            addCriterion("linktel not between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlIsNull() {
            addCriterion("chk_dup_url is null");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlIsNotNull() {
            addCriterion("chk_dup_url is not null");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlEqualTo(String value) {
            addCriterion("chk_dup_url =", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlNotEqualTo(String value) {
            addCriterion("chk_dup_url <>", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlGreaterThan(String value) {
            addCriterion("chk_dup_url >", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlGreaterThanOrEqualTo(String value) {
            addCriterion("chk_dup_url >=", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlLessThan(String value) {
            addCriterion("chk_dup_url <", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlLessThanOrEqualTo(String value) {
            addCriterion("chk_dup_url <=", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlLike(String value) {
            addCriterion("chk_dup_url like", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlNotLike(String value) {
            addCriterion("chk_dup_url not like", value, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlIn(List<String> values) {
            addCriterion("chk_dup_url in", values, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlNotIn(List<String> values) {
            addCriterion("chk_dup_url not in", values, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlBetween(String value1, String value2) {
            addCriterion("chk_dup_url between", value1, value2, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andChkDupUrlNotBetween(String value1, String value2) {
            addCriterion("chk_dup_url not between", value1, value2, "chkDupUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNull() {
            addCriterion("push_url is null");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNotNull() {
            addCriterion("push_url is not null");
            return (Criteria) this;
        }

        public Criteria andPushUrlEqualTo(String value) {
            addCriterion("push_url =", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotEqualTo(String value) {
            addCriterion("push_url <>", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThan(String value) {
            addCriterion("push_url >", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThanOrEqualTo(String value) {
            addCriterion("push_url >=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThan(String value) {
            addCriterion("push_url <", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThanOrEqualTo(String value) {
            addCriterion("push_url <=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLike(String value) {
            addCriterion("push_url like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotLike(String value) {
            addCriterion("push_url not like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlIn(List<String> values) {
            addCriterion("push_url in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotIn(List<String> values) {
            addCriterion("push_url not in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlBetween(String value1, String value2) {
            addCriterion("push_url between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotBetween(String value1, String value2) {
            addCriterion("push_url not between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Long value) {
            addCriterion("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Long value) {
            addCriterion("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Long value) {
            addCriterion("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Long value) {
            addCriterion("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Long value) {
            addCriterion("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Long value) {
            addCriterion("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Long> values) {
            addCriterion("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Long> values) {
            addCriterion("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Long value1, Long value2) {
            addCriterion("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Long value1, Long value2) {
            addCriterion("lasttime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andPushSecretIsNull() {
            addCriterion("push_secret is null");
            return (Criteria) this;
        }

        public Criteria andPushSecretIsNotNull() {
            addCriterion("push_secret is not null");
            return (Criteria) this;
        }

        public Criteria andPushSecretEqualTo(String value) {
            addCriterion("push_secret =", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretNotEqualTo(String value) {
            addCriterion("push_secret <>", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretGreaterThan(String value) {
            addCriterion("push_secret >", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretGreaterThanOrEqualTo(String value) {
            addCriterion("push_secret >=", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretLessThan(String value) {
            addCriterion("push_secret <", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretLessThanOrEqualTo(String value) {
            addCriterion("push_secret <=", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretLike(String value) {
            addCriterion("push_secret like", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretNotLike(String value) {
            addCriterion("push_secret not like", value, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretIn(List<String> values) {
            addCriterion("push_secret in", values, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretNotIn(List<String> values) {
            addCriterion("push_secret not in", values, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretBetween(String value1, String value2) {
            addCriterion("push_secret between", value1, value2, "pushSecret");
            return (Criteria) this;
        }

        public Criteria andPushSecretNotBetween(String value1, String value2) {
            addCriterion("push_secret not between", value1, value2, "pushSecret");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
