##CREATE SCHEMA MOCKII;

USE heroku_e7cc9cb87d6f209;

create table OCCUPATIONS_CATEGORY
(
  OCCUPATION_CATEGORY_TYPE varchar(55) not null,
  OCCUPATION_CATEGORY_ID   int auto_increment
    primary key,
  CREATED_DATE             datetime    not null,
  UPDATED_DATE             datetime    not null,
  constraint OCCUPATIONS_CATEGORY_OCCUPATION_ID_uindex
  unique (OCCUPATION_CATEGORY_ID)
)
  engine = InnoDB;

create table OCCUPATIONS
(
  OCCUPATION             varchar(50) null,
  OCCUPATION_ID          int auto_increment
    primary key,
  CREATED_DATE           datetime    not null,
  UPDATED_DATE           datetime    not null,
  OCCUPATION_CATEGORY_ID int         not null,
  constraint OCCUPATION_CATEGORY_ID_FK
  foreign key (OCCUPATION_CATEGORY_ID) references OCCUPATIONS_CATEGORY (OCCUPATION_CATEGORY_ID)
)
  engine = InnoDB;

create index OCCUPATION_CATEGORY_ID
  on OCCUPATIONS (OCCUPATION_CATEGORY_ID);

create table OCCUPATIONS_OCCUPATIONS_CATEGORY
(
  OCC_OCC_CATEGORY_ID    int auto_increment
    primary key,
  OCCUPATION_ID          int not null,
  OCCUPATION_CATEGORY_ID int null
)
  engine = InnoDB;

create index OCCUPATION_CATEGORY_ID
  on OCCUPATIONS_OCCUPATIONS_CATEGORY (OCCUPATION_CATEGORY_ID);

create index OCCUPATION_ID
  on OCCUPATIONS_OCCUPATIONS_CATEGORY (OCCUPATION_ID);

create table OCCUPATIONS_TECHNOLOGY
(
  OCC_TECH_ID   int auto_increment
    primary key,
  OCCUPATION_ID int not null,
  TECHNOLOGY_ID int not null
)
  engine = InnoDB;

create index OCCUPATION_TECHNOLOGY_UQ_INDEX
  on OCCUPATIONS_TECHNOLOGY (OCCUPATION_ID, TECHNOLOGY_ID);

create index TECHNOLOGY_ID
  on OCCUPATIONS_TECHNOLOGY (TECHNOLOGY_ID);

create table SUBJECT
(
  SUBJECT_ID   int auto_increment
    primary key,
  SUBJECT      varchar(50) not null,
  CREATED_DATE datetime    not null,
  UPDATED_DATE datetime    not null
)
  engine = InnoDB;

create index SUBJECT_ID
  on SUBJECT (SUBJECT_ID);

create table SUBJECT_TOPIC
(
  SUBJECT_ID       int not null,
  TOPIC_ID         int not null,
  SUBJECT_TOPIC_ID int auto_increment
    primary key
)
  engine = InnoDB;

create index SUBJECT_ID
  on SUBJECT_TOPIC (SUBJECT_ID);

create index SUBJECT_TOPIC_UQ_INDEX
  on SUBJECT_TOPIC (SUBJECT_ID, TOPIC_ID);

create index TOPIC_ID
  on SUBJECT_TOPIC (TOPIC_ID);

create table TECHNOLOGIES
(
  TECHNOLOGY_ID int auto_increment
    primary key,
  TECHNOLOGY    varchar(1000) default '' not null,
  CREATED_DATE  datetime                 not null,
  UPDATED_DATE  datetime                 not null,
  constraint TECHNOLOGY_ID_UNIQUE
  unique (TECHNOLOGY_ID)
)
  engine = InnoDB;

create table TECHNOLOGY_SUBJECT
(
  TECHNOLOGY_ID int not null,
  SUBJECT_ID    int not null,
  TECHS_SUBS_ID int auto_increment
    primary key
)
  engine = InnoDB;

create index SUBJECT_ID
  on TECHNOLOGY_SUBJECT (SUBJECT_ID);

create index TECHNOLOGY_ID
  on TECHNOLOGY_SUBJECT (TECHNOLOGY_ID);

create index TECHNOLOGY_SUBJECT_UQ_INDEX
  on TECHNOLOGY_SUBJECT (TECHNOLOGY_ID, SUBJECT_ID);

create table TOPIC
(
  TOPIC_ID     int auto_increment
    primary key,
  TOPIC        varchar(50)                        not null,
  CREATED_DATE datetime default null,
  UPDATED_DATE datetime default null,
  constraint TOPIC_ID_UNIQUE
  unique (TOPIC_ID),
  constraint UPDATED_DATE_UNIQUE
  unique (UPDATED_DATE)
)
  engine = InnoDB;

create index TOPIC_ID
  on TOPIC (TOPIC_ID);

create table USER_PROFILE
(
  USER_ID       int auto_increment
    primary key,
  FIRST_NAME    varchar(45)                        not null,
  MIDDLE_NAME   varchar(45)                        null,
  LAST_NAME     varchar(45)                        not null,
  EMAIL_ID      varchar(45)                        not null,
  PHONE_NUMBER  varchar(45)                        not null,
  LAST_ACCESSED varchar(45)                        null,
  DOB           date                               null,
  ACCOUNT_TYPE  varchar(45)                        null,
  CREATED_DATE  datetime default null,
  UPDATED_DATE  datetime default null,
  constraint id_UNIQUE
  unique (USER_ID)
)
  engine = InnoDB;

create table INTERVIEWS
(
  INTERVIEW_ID               int auto_increment
    primary key,
  INTERVIEW_DATE             datetime    not null,
  INTERVIEWEE_ID             int         not null,
  INTERVIEWER_ID             int         not null,
  OVERALL_INTERVIEWER_RATING varchar(10) not null,
  OVERALL_INTERVIEWEE_RATING varchar(10) not null,
  CREATED_DATE               datetime    not null,
  UPDATED_DATE               datetime    not null,
  constraint INTERVIEW_ID_UNIQUE
  unique (INTERVIEW_ID),
  constraint INTERVIEWS_ibfk_1
  foreign key (INTERVIEWEE_ID) references USER_PROFILE (USER_ID),
  constraint INTERVIEWS_ibfk_2
  foreign key (INTERVIEWER_ID) references USER_PROFILE (USER_ID)
)
  engine = InnoDB;

create table FEEDBACK
(
  FEEDBACK_ID      int           not null,
  INTERVIEW_ID     int           not null,
  RATING           varchar(10)   not null,
  FEEDBACK         varchar(1000) not null,
  SUBJECT_TOPIC_ID int           not null,
  CREATED_DATE     datetime      not null,
  UPDATED_DATE     datetime      not null,
  constraint FEEDBACK_ibfk_1
  foreign key (INTERVIEW_ID) references INTERVIEWS (INTERVIEW_ID),
  constraint FEEDBACK_ibfk_2
  foreign key (SUBJECT_TOPIC_ID) references SUBJECT_TOPIC (SUBJECT_TOPIC_ID)
)
  engine = InnoDB;

create index INTERVIEW_ID
  on FEEDBACK (INTERVIEW_ID);

create index SUBJECT_TOPIC_ID
  on FEEDBACK (SUBJECT_TOPIC_ID);

create index TOPIC_ID
  on FEEDBACK (SUBJECT_TOPIC_ID);

create index INTERVIEWEE_ID
  on INTERVIEWS (INTERVIEWEE_ID);

create index INTERVIEWER_ID
  on INTERVIEWS (INTERVIEWER_ID);

create table JOB_PROFILE
(
  USERID         int         not null,
  CURRENT_TITLE  varchar(45) null,
  JOB_PROFILE_ID int auto_increment
    primary key,
  CREATED_DATE   datetime    not null,
  UPDATED_DATE   datetime    not null,
  constraint JOB_PROFILE_ID_UNIQUE
  unique (JOB_PROFILE_ID),
  constraint JOB_PROFILE_ibfk_1
  foreign key (USERID) references USER_PROFILE (USER_ID)
    on delete cascade
)
  engine = InnoDB;

create index USER_ID_FK_idx
  on JOB_PROFILE (USERID);

create table MEMBERSHIP
(
  USERID        int         not null,
  ACCOUNT_TYPE  varchar(45) not null,
  ACTIVE        varchar(45) not null,
  MEMBERSHIP_ID int auto_increment
    primary key,
  CREATED_DATE  datetime    not null,
  UPDATED_DATE  datetime    not null,
  constraint MEMBERSHIP_ID_UNIQUE
  unique (MEMBERSHIP_ID),
  constraint MEMBERSHIP_ibfk_1
  foreign key (USERID) references USER_PROFILE (USER_ID)
    on delete cascade
)
  engine = InnoDB;

create index MEMBERSHIP_ID_FK_idx
  on MEMBERSHIP (USERID);

create table SKILLSET
(
  SKILL_SET_ID     int      not null,
  INTERVIEW_ID     int      not null,
  SUBJECT_TOPIC_ID int      not null,
  CREATED_DATE     datetime not null,
  UPDATED_DATE     datetime not null,
  constraint SKILLSET_ibfk_1
  foreign key (INTERVIEW_ID) references INTERVIEWS (INTERVIEW_ID),
  constraint SKILLSET_ibfk_2
  foreign key (SUBJECT_TOPIC_ID) references SUBJECT_TOPIC (SUBJECT_TOPIC_ID)
)
  engine = InnoDB;

create index INTERVIEW_ID
  on SKILLSET (INTERVIEW_ID);

create index SUBJECT_TOPIC_ID
  on SKILLSET (SUBJECT_TOPIC_ID);

create index TOPIC_ID
  on SKILLSET (SUBJECT_TOPIC_ID);

