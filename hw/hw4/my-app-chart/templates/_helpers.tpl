{{- define "my-spring-app.fullname" -}}
{{ .Release.Name | lower }}
{{- end }}
