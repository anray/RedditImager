package com.example.anray.redditimager.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by anray on 02.03.2017.
 */

public class PictureRes {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("data")
    @Expose
    public Data data;

    class Data {

        @SerializedName("modhash")
        @Expose
        public String modhash;
        @SerializedName("children")
        @Expose
        public List<Child> children = null;
        @SerializedName("after")
        @Expose
        public Object after;
        @SerializedName("before")
        @Expose
        public Object before;

        class Child {

            @SerializedName("kind")
            @Expose
            public String kind;
            @SerializedName("data")
            @Expose
            public Data_ data;

            class Data_ {

                @SerializedName("contest_mode")
                @Expose
                public Boolean contestMode;
                @SerializedName("banned_by")
                @Expose
                public Object bannedBy;
                @SerializedName("media_embed")
                @Expose
                public MediaEmbed mediaEmbed;
                @SerializedName("subreddit")
                @Expose
                public String subreddit;
                @SerializedName("selftext_html")
                @Expose
                public Object selftextHtml;
                @SerializedName("selftext")
                @Expose
                public String selftext;
                @SerializedName("likes")
                @Expose
                public Object likes;
                @SerializedName("suggested_sort")
                @Expose
                public Object suggestedSort;
                @SerializedName("user_reports")
                @Expose
                public List<Object> userReports = null;
                @SerializedName("secure_media")
                @Expose
                public Object secureMedia;
                @SerializedName("link_flair_text")
                @Expose
                public Object linkFlairText;
                @SerializedName("id")
                @Expose
                public String id;
                @SerializedName("gilded")
                @Expose
                public Integer gilded;
                @SerializedName("secure_media_embed")
                @Expose
                public SecureMediaEmbed secureMediaEmbed;
                @SerializedName("clicked")
                @Expose
                public Boolean clicked;
                @SerializedName("score")
                @Expose
                public Integer score;
                @SerializedName("report_reasons")
                @Expose
                public Object reportReasons;
                @SerializedName("author")
                @Expose
                public String author;
                @SerializedName("saved")
                @Expose
                public Boolean saved;
                @SerializedName("mod_reports")
                @Expose
                public List<Object> modReports = null;
                @SerializedName("name")
                @Expose
                public String name;
                @SerializedName("subreddit_name_prefixed")
                @Expose
                public String subredditNamePrefixed;
                @SerializedName("approved_by")
                @Expose
                public Object approvedBy;
                @SerializedName("over_18")
                @Expose
                public Boolean over18;
                @SerializedName("domain")
                @Expose
                public String domain;
                @SerializedName("hidden")
                @Expose
                public Boolean hidden;
                @SerializedName("preview")
                @Expose
                public Preview preview;
                @SerializedName("thumbnail")
                @Expose
                public String thumbnail;
                @SerializedName("subreddit_id")
                @Expose
                public String subredditId;
                @SerializedName("edited")
                @Expose
                public Boolean edited;
                @SerializedName("link_flair_css_class")
                @Expose
                public Object linkFlairCssClass;
                @SerializedName("author_flair_css_class")
                @Expose
                public String authorFlairCssClass;
                @SerializedName("downs")
                @Expose
                public Integer downs;
                @SerializedName("brand_safe")
                @Expose
                public Boolean brandSafe;
                @SerializedName("archived")
                @Expose
                public Boolean archived;
                @SerializedName("removal_reason")
                @Expose
                public Object removalReason;
                @SerializedName("post_hint")
                @Expose
                public String postHint;
                @SerializedName("is_self")
                @Expose
                public Boolean isSelf;
                @SerializedName("hide_score")
                @Expose
                public Boolean hideScore;
                @SerializedName("spoiler")
                @Expose
                public Boolean spoiler;
                @SerializedName("permalink")
                @Expose
                public String permalink;
                @SerializedName("num_reports")
                @Expose
                public Object numReports;
                @SerializedName("locked")
                @Expose
                public Boolean locked;
                @SerializedName("stickied")
                @Expose
                public Boolean stickied;
                @SerializedName("created")
                @Expose
                public Integer created;
                @SerializedName("url")
                @Expose
                public String url;
                @SerializedName("author_flair_text")
                @Expose
                public Object authorFlairText;
                @SerializedName("quarantine")
                @Expose
                public Boolean quarantine;
                @SerializedName("title")
                @Expose
                public String title;
                @SerializedName("created_utc")
                @Expose
                public Integer createdUtc;
                @SerializedName("distinguished")
                @Expose
                public Object distinguished;
                @SerializedName("media")
                @Expose
                public Object media;
                @SerializedName("num_comments")
                @Expose
                public Integer numComments;
                @SerializedName("visited")
                @Expose
                public Boolean visited;
                @SerializedName("subreddit_type")
                @Expose
                public String subredditType;
                @SerializedName("ups")
                @Expose
                public Integer ups;

                class MediaEmbed {
                }

                public class SecureMediaEmbed {
                }

                class Preview {

                    @SerializedName("images")
                    @Expose
                    public List<Image> images = null;
                    @SerializedName("enabled")
                    @Expose
                    public Boolean enabled;

                    class Image {

                        @SerializedName("source")
                        @Expose
                        public Source source;
                        @SerializedName("resolutions")
                        @Expose
                        public List<Resolution> resolutions = null;
                        @SerializedName("variants")
                        @Expose
                        public Variants variants;
                        @SerializedName("id")
                        @Expose
                        public String id;

                        class Source {

                            @SerializedName("url")
                            @Expose
                            public String url;
                            @SerializedName("width")
                            @Expose
                            public Integer width;
                            @SerializedName("height")
                            @Expose
                            public Integer height;

                        }

                        class Resolution {

                            @SerializedName("url")
                            @Expose
                            public String url;
                            @SerializedName("width")
                            @Expose
                            public Integer width;
                            @SerializedName("height")
                            @Expose
                            public Integer height;

                        }

                        class Variants {
                        }

                    }

                }

            }

        }

    }


}