package clue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ClUserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidIsNull() {
            addCriterion("third_openid is null");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidIsNotNull() {
            addCriterion("third_openid is not null");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidEqualTo(String value) {
            addCriterion("third_openid =", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidNotEqualTo(String value) {
            addCriterion("third_openid <>", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidGreaterThan(String value) {
            addCriterion("third_openid >", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("third_openid >=", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidLessThan(String value) {
            addCriterion("third_openid <", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidLessThanOrEqualTo(String value) {
            addCriterion("third_openid <=", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidLike(String value) {
            addCriterion("third_openid like", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidNotLike(String value) {
            addCriterion("third_openid not like", value, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidIn(List<String> values) {
            addCriterion("third_openid in", values, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidNotIn(List<String> values) {
            addCriterion("third_openid not in", values, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidBetween(String value1, String value2) {
            addCriterion("third_openid between", value1, value2, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdOpenidNotBetween(String value1, String value2) {
            addCriterion("third_openid not between", value1, value2, "thirdOpenid");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyIsNull() {
            addCriterion("third_sessionkey is null");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyIsNotNull() {
            addCriterion("third_sessionkey is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyEqualTo(String value) {
            addCriterion("third_sessionkey =", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyNotEqualTo(String value) {
            addCriterion("third_sessionkey <>", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyGreaterThan(String value) {
            addCriterion("third_sessionkey >", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("third_sessionkey >=", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyLessThan(String value) {
            addCriterion("third_sessionkey <", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyLessThanOrEqualTo(String value) {
            addCriterion("third_sessionkey <=", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyLike(String value) {
            addCriterion("third_sessionkey like", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyNotLike(String value) {
            addCriterion("third_sessionkey not like", value, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyIn(List<String> values) {
            addCriterion("third_sessionkey in", values, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyNotIn(List<String> values) {
            addCriterion("third_sessionkey not in", values, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyBetween(String value1, String value2) {
            addCriterion("third_sessionkey between", value1, value2, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdSessionkeyNotBetween(String value1, String value2) {
            addCriterion("third_sessionkey not between", value1, value2, "thirdSessionkey");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoIsNull() {
            addCriterion("third_ext_info is null");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoIsNotNull() {
            addCriterion("third_ext_info is not null");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoEqualTo(String value) {
            addCriterion("third_ext_info =", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoNotEqualTo(String value) {
            addCriterion("third_ext_info <>", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoGreaterThan(String value) {
            addCriterion("third_ext_info >", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("third_ext_info >=", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoLessThan(String value) {
            addCriterion("third_ext_info <", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoLessThanOrEqualTo(String value) {
            addCriterion("third_ext_info <=", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoLike(String value) {
            addCriterion("third_ext_info like", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoNotLike(String value) {
            addCriterion("third_ext_info not like", value, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoIn(List<String> values) {
            addCriterion("third_ext_info in", values, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoNotIn(List<String> values) {
            addCriterion("third_ext_info not in", values, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoBetween(String value1, String value2) {
            addCriterion("third_ext_info between", value1, value2, "thirdExtInfo");
            return (Criteria) this;
        }

        public Criteria andThirdExtInfoNotBetween(String value1, String value2) {
            addCriterion("third_ext_info not between", value1, value2, "thirdExtInfo");
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

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
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

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("lasttime not between", value1, value2, "lasttime");
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