package clue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClClueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ClClueExample() {
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

        public Criteria andClIdIsNull() {
            addCriterion("cl_id is null");
            return (Criteria) this;
        }

        public Criteria andClIdIsNotNull() {
            addCriterion("cl_id is not null");
            return (Criteria) this;
        }

        public Criteria andClIdEqualTo(Long value) {
            addCriterion("cl_id =", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotEqualTo(Long value) {
            addCriterion("cl_id <>", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThan(Long value) {
            addCriterion("cl_id >", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cl_id >=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThan(Long value) {
            addCriterion("cl_id <", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThanOrEqualTo(Long value) {
            addCriterion("cl_id <=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdIn(List<Long> values) {
            addCriterion("cl_id in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotIn(List<Long> values) {
            addCriterion("cl_id not in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdBetween(Long value1, Long value2) {
            addCriterion("cl_id between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotBetween(Long value1, Long value2) {
            addCriterion("cl_id not between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClTypeIsNull() {
            addCriterion("cl_type is null");
            return (Criteria) this;
        }

        public Criteria andClTypeIsNotNull() {
            addCriterion("cl_type is not null");
            return (Criteria) this;
        }

        public Criteria andClTypeEqualTo(Integer value) {
            addCriterion("cl_type =", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotEqualTo(Integer value) {
            addCriterion("cl_type <>", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeGreaterThan(Integer value) {
            addCriterion("cl_type >", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_type >=", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeLessThan(Integer value) {
            addCriterion("cl_type <", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cl_type <=", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeIn(List<Integer> values) {
            addCriterion("cl_type in", values, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotIn(List<Integer> values) {
            addCriterion("cl_type not in", values, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeBetween(Integer value1, Integer value2) {
            addCriterion("cl_type between", value1, value2, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_type not between", value1, value2, "clType");
            return (Criteria) this;
        }

        public Criteria andClStatusIsNull() {
            addCriterion("cl_status is null");
            return (Criteria) this;
        }

        public Criteria andClStatusIsNotNull() {
            addCriterion("cl_status is not null");
            return (Criteria) this;
        }

        public Criteria andClStatusEqualTo(Integer value) {
            addCriterion("cl_status =", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotEqualTo(Integer value) {
            addCriterion("cl_status <>", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusGreaterThan(Integer value) {
            addCriterion("cl_status >", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_status >=", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusLessThan(Integer value) {
            addCriterion("cl_status <", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cl_status <=", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusIn(List<Integer> values) {
            addCriterion("cl_status in", values, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotIn(List<Integer> values) {
            addCriterion("cl_status not in", values, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusBetween(Integer value1, Integer value2) {
            addCriterion("cl_status between", value1, value2, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_status not between", value1, value2, "clStatus");
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

        public Criteria andClLinkMobIsNull() {
            addCriterion("cl_link_mob is null");
            return (Criteria) this;
        }

        public Criteria andClLinkMobIsNotNull() {
            addCriterion("cl_link_mob is not null");
            return (Criteria) this;
        }

        public Criteria andClLinkMobEqualTo(String value) {
            addCriterion("cl_link_mob =", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobNotEqualTo(String value) {
            addCriterion("cl_link_mob <>", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobGreaterThan(String value) {
            addCriterion("cl_link_mob >", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobGreaterThanOrEqualTo(String value) {
            addCriterion("cl_link_mob >=", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobLessThan(String value) {
            addCriterion("cl_link_mob <", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobLessThanOrEqualTo(String value) {
            addCriterion("cl_link_mob <=", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobLike(String value) {
            addCriterion("cl_link_mob like", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobNotLike(String value) {
            addCriterion("cl_link_mob not like", value, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobIn(List<String> values) {
            addCriterion("cl_link_mob in", values, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobNotIn(List<String> values) {
            addCriterion("cl_link_mob not in", values, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobBetween(String value1, String value2) {
            addCriterion("cl_link_mob between", value1, value2, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkMobNotBetween(String value1, String value2) {
            addCriterion("cl_link_mob not between", value1, value2, "clLinkMob");
            return (Criteria) this;
        }

        public Criteria andClLinkManIsNull() {
            addCriterion("cl_link_man is null");
            return (Criteria) this;
        }

        public Criteria andClLinkManIsNotNull() {
            addCriterion("cl_link_man is not null");
            return (Criteria) this;
        }

        public Criteria andClLinkManEqualTo(String value) {
            addCriterion("cl_link_man =", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManNotEqualTo(String value) {
            addCriterion("cl_link_man <>", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManGreaterThan(String value) {
            addCriterion("cl_link_man >", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("cl_link_man >=", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManLessThan(String value) {
            addCriterion("cl_link_man <", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManLessThanOrEqualTo(String value) {
            addCriterion("cl_link_man <=", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManLike(String value) {
            addCriterion("cl_link_man like", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManNotLike(String value) {
            addCriterion("cl_link_man not like", value, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManIn(List<String> values) {
            addCriterion("cl_link_man in", values, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManNotIn(List<String> values) {
            addCriterion("cl_link_man not in", values, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManBetween(String value1, String value2) {
            addCriterion("cl_link_man between", value1, value2, "clLinkMan");
            return (Criteria) this;
        }

        public Criteria andClLinkManNotBetween(String value1, String value2) {
            addCriterion("cl_link_man not between", value1, value2, "clLinkMan");
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